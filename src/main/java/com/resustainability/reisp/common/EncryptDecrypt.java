package com.resustainability.reisp.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncryptDecrypt {

	 private static final String SECRET_KEY_1 = "ssdkF$HUy2A#D%kd";
	    private static final String SECRET_KEY_2 = "weJiSEvR5yAC5ftB";
	 
	    private static IvParameterSpec ivParameterSpec;
	    private static SecretKeySpec secretKeySpec;
	    private static Cipher cipher;
	    byte [] iv = new byte [16];
	    public EncryptDecrypt() throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException {
	        //final byte[][] keyAndIV = GenerateKeyAndIV(32, 16, 1, saltData, SECRET_KEY_1.getBytes(StandardCharsets.UTF_8), md5);
	    	ivParameterSpec = new IvParameterSpec(SECRET_KEY_1.getBytes(StandardCharsets.UTF_8));
	        secretKeySpec = new SecretKeySpec(SECRET_KEY_2.getBytes(StandardCharsets.UTF_8), "AES");
	        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	        
	    }
	    
	 
	    /**
	     * Encrypt the string with this internal algorithm.
	     *
	     * @param toBeEncrypt string object to be encrypt.
	     * @return returns encrypted string.
	     * @throws NoSuchPaddingException
	     * @throws NoSuchAlgorithmException
	     * @throws InvalidAlgorithmParameterException
	     * @throws InvalidKeyException
	     * @throws BadPaddingException
	     * @throws IllegalBlockSizeException
	     */
	    public static String encrypt(String toBeEncrypt) throws NoSuchPaddingException, NoSuchAlgorithmException,
	            InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException,NullPointerException {
	    	ivParameterSpec = new IvParameterSpec(SECRET_KEY_1.getBytes(StandardCharsets.UTF_8));
	        secretKeySpec = new SecretKeySpec(SECRET_KEY_2.getBytes(StandardCharsets.UTF_8), "AES");
	        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    	cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
	        byte[] encrypted = cipher.doFinal(toBeEncrypt.getBytes());
	        return Base64.encodeBase64String(encrypted);
	    }
	    
	    public static Object encryptObject(Object object) throws NoSuchPaddingException, NoSuchAlgorithmException,
	    InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, IOException {
	    	
	    	cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
	    	
	    	 // create sealed object
	        SealedObject sealed = new SealedObject((Serializable) object, cipher);
	        
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        CipherOutputStream cipherOutputStream = new CipherOutputStream(
	                outputStream, cipher);

	        ObjectOutputStream oos = new ObjectOutputStream(cipherOutputStream);
	        oos.writeObject( sealed );
	        cipherOutputStream.close();

	        byte[] values = outputStream.toByteArray();

	        byte[] base64encoded = Base64.encodeBase64(values);
	         
	        System.out.println("Object encrypted");
	        
	         return sealed;
	    	
	    	
	    	//byte[] encrypted = cipher.doFinal(((String) object).getBytes());
	    	//return Base64.encodeBase64String(encrypted);
	    }
	 
	    /**
	     * Decrypt this string with the internal algorithm. The passed argument should be encrypted using
	     * {@link #encrypt(String) encrypt} method of this class.
	     *
	     * @param encrypted encrypted string that was encrypted using {@link #encrypt(String) encrypt} method.
	     * @return decrypted string.
	     * @throws InvalidAlgorithmParameterException
	     * @throws InvalidKeyException
	     * @throws BadPaddingException
	     * @throws IllegalBlockSizeException
	     */
	    public static String decryptX(String encrypted) throws InvalidAlgorithmParameterException, InvalidKeyException,
	            BadPaddingException, IllegalBlockSizeException {
	        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
	        byte[] decryptedBytes = cipher.doFinal(Base64.decodeBase64(encrypted));
	        return new String(decryptedBytes);
	    }
	    
	    public static <T> T decryptObject(Serializable object) throws InvalidAlgorithmParameterException, InvalidKeyException,
	    BadPaddingException, IllegalBlockSizeException, ClassNotFoundException, IOException, NoSuchAlgorithmException, NoSuchPaddingException {
	    	cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
	    	
	    	
	    	  // create stream
//	        CipherInputStream cipherInputStream = new CipherInputStream((InputStream) obj , cipher );
//	        ObjectInputStream inputStream = new ObjectInputStream( cipherInputStream );
//	        SealedObject sealedObject = (SealedObject) inputStream.readObject();
	    
	    	//SealedObject sealedObject = new SealedObject((Serializable) obj, cipher);
	    	Object decryptobj = (Object) ((SealedObject) object).getObject(cipher);
	    	System.out.println("Object decrypted");
	    	return (T) decryptobj;
	    	
	    	
	    	
	    	
	    	//byte[] decryptedBytes = cipher.doFinal(Base64.decodeBase64(encrypted));
	    	//return new String(decryptedBytes);
	    }
	    
	  
	    
	    public static String base64Encode(String token) {
	        byte[] encodedBytes = org.springframework.security.crypto.codec.Base64.encode(token.getBytes());
	        return new String(encodedBytes, Charset.forName("UTF-8"));
	    }


	    public static String base64Decode(String token) {
	        byte[] decodedBytes = org.springframework.security.crypto.codec.Base64.decode(token.getBytes());
	        return new String(decodedBytes, Charset.forName("UTF-8"));
	    }
	    
	  //------------------------------------------------------------------------------------------------------------  
	    public static String decrypt(String cipherText){

	        String decryptedText=null;
	        byte[] cipherData = java.util.Base64.getDecoder().decode(cipherText);
	        byte[] saltData = Arrays.copyOfRange(cipherData, 8, 16);
	        try{
	            MessageDigest md5 = MessageDigest.getInstance("MD5");
	            final byte[][] keyAndIV = GenerateKeyAndIV(32, 16, 1, saltData, SECRET_KEY_1.getBytes(StandardCharsets.UTF_8), md5);
	            SecretKeySpec key = new SecretKeySpec(keyAndIV[0], "AES");
	            IvParameterSpec iv = new IvParameterSpec(keyAndIV[1]);

	            byte[] encrypted = Arrays.copyOfRange(cipherData, 16, cipherData.length);
	            Cipher aesCBC = Cipher.getInstance("AES/CBC/PKCS5Padding");
	            aesCBC.init(Cipher.DECRYPT_MODE, key, iv);
	            byte[] decryptedData = aesCBC.doFinal(encrypted);
	            decryptedText = new String(decryptedData, StandardCharsets.UTF_8);
	           // LOGGER.info("decryptedText success");
	            return decryptedText;
	        }
	        catch (Exception ex){
	            //LOGGER.error("error on decrypt: "+ex.getMessage());
	            return decryptedText;
	        }
	    }
	    
	    public static byte[][] GenerateKeyAndIV(int keyLength, int ivLength, int iterations, byte[] salt, byte[] password, MessageDigest md) {

	        int digestLength = md.getDigestLength();
	        int requiredLength = (keyLength + ivLength + digestLength - 1) / digestLength * digestLength;
	        byte[] generatedData = new byte[requiredLength];
	        int generatedLength = 0;

	        try {
	            md.reset();

	            // Repeat process until sufficient data has been generated
	            while (generatedLength < keyLength + ivLength) {

	                // Digest data (last digest if available, password data, salt if available)
	                if (generatedLength > 0)
	                    md.update(generatedData, generatedLength - digestLength, digestLength);
	                md.update(password);
	                if (salt != null)
	                    md.update(salt, 0, 8);
	                md.digest(generatedData, generatedLength, digestLength);

	                // additional rounds
	                for (int i = 1; i < iterations; i++) {
	                    md.update(generatedData, generatedLength, digestLength);
	                    md.digest(generatedData, generatedLength, digestLength);
	                }

	                generatedLength += digestLength;
	            }

	            // Copy key and IV into separate byte arrays
	            byte[][] result = new byte[2][];
	            result[0] = Arrays.copyOfRange(generatedData, 0, keyLength);
	            if (ivLength > 0)
	                result[1] = Arrays.copyOfRange(generatedData, keyLength, keyLength + ivLength);

	            return result;

	        } catch (DigestException e) {

	            throw new RuntimeException(e);

	        } finally {
	            // Clean out temporary data
	            Arrays.fill(generatedData, (byte)0);
	        }
	    }
	    
}
