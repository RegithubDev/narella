package com.resustainability.reisp.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


public class FileUploads {
	
	private static Logger logger = Logger.getLogger(FileUploads.class);
	
	public static void singleFileSaving(MultipartFile multipartFile,String saveDirectory,String fileName) throws IllegalStateException, IOException {
		try {
			if (!StringUtils.isEmpty(multipartFile) && multipartFile.getSize() > 0) {
	            //String fileName = file.getOriginalFilename();	            
	            File directory = new File(saveDirectory);
                if (!directory.exists()) {
                	directory.mkdirs();
                	boolean flag = OSValidator.isUnix();
                	if(flag) {
                    	String perm = "rwxrwxrwx";
    	            	Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perm);
    	            	Files.setPosixFilePermissions(directory.toPath(), permissions);
                	}
                }
                
                File file = new File(saveDirectory + fileName);
                
                multipartFile.transferTo(file);
                
                boolean flag = OSValidator.isUnix();
            	if(flag) {
	                if(file.exists()) {
	                    //Setting file permissions for owner, group and others using PosixFilePermission
	                     
	                    HashSet<PosixFilePermission> permissions = new HashSet<PosixFilePermission>();
	                     
	                    //Adding owner's file permissions
	                     
	                    permissions.add(PosixFilePermission.OWNER_EXECUTE);
	                    permissions.add(PosixFilePermission.OWNER_READ);
	                    permissions.add(PosixFilePermission.OWNER_WRITE);
	                     
	                    //Adding group's file permissions
	                     
	                    permissions.add(PosixFilePermission.GROUP_EXECUTE);
	                    permissions.add(PosixFilePermission.GROUP_READ);
	                    permissions.add(PosixFilePermission.GROUP_WRITE);
	                     
	                    //Adding other's file permissions
	                     
	                    permissions.add(PosixFilePermission.OTHERS_EXECUTE);
	                    permissions.add(PosixFilePermission.OTHERS_READ);
	                    permissions.add(PosixFilePermission.OTHERS_WRITE);
	                     
	                    Files.setPosixFilePermissions(Paths.get(saveDirectory + fileName), permissions);
	                }
            	}
	        }
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("singleFileSaving() : "+e.getMessage());
		}
    }
	
	public static void bytesInFileSaving(byte[] bytes,String saveDirectory,String fileName) throws IllegalStateException, IOException {
		try {
			if (!StringUtils.isEmpty(bytes) && bytes.length > 0) {
	            //String fileName = file.getOriginalFilename();	            
	            File directory = new File(saveDirectory);
                if (!directory.exists()) {
                	directory.mkdirs();
                	boolean flag = OSValidator.isUnix();
                	if(flag) {
                    	String perm = "rwxrwxrwx";
    	            	Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perm);
    	            	Files.setPosixFilePermissions(directory.toPath(), permissions);
                	}
                }
                
                File file = new File(saveDirectory + fileName);
                
                FileUtils.writeByteArrayToFile(file, bytes);
                
                boolean flag = OSValidator.isUnix();
            	if(flag) {
	                if(file.exists()) {
	                    //Setting file permissions for owner, group and others using PosixFilePermission
	                     
	                    HashSet<PosixFilePermission> permissions = new HashSet<PosixFilePermission>();
	                     
	                    //Adding owner's file permissions
	                     
	                    permissions.add(PosixFilePermission.OWNER_EXECUTE);
	                    permissions.add(PosixFilePermission.OWNER_READ);
	                    permissions.add(PosixFilePermission.OWNER_WRITE);
	                     
	                    //Adding group's file permissions
	                     
	                    permissions.add(PosixFilePermission.GROUP_EXECUTE);
	                    permissions.add(PosixFilePermission.GROUP_READ);
	                    permissions.add(PosixFilePermission.GROUP_WRITE);
	                     
	                    //Adding other's file permissions
	                     
	                    permissions.add(PosixFilePermission.OTHERS_EXECUTE);
	                    permissions.add(PosixFilePermission.OTHERS_READ);
	                    permissions.add(PosixFilePermission.OTHERS_WRITE);
	                     
	                    Files.setPosixFilePermissions(Paths.get(saveDirectory + fileName), permissions);
	                }
            	}
	        }
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("bytesInFileSaving() : "+e.getMessage());
		}
    }
	
	public static void multipleFilesSaving(List<MultipartFile> files,String saveDirectory) throws IllegalStateException, IOException {
		try { 
	        if (null != files && files.size() > 0) {
	            for (MultipartFile multipartFile : files) {
	            	if (!StringUtils.isEmpty(multipartFile) && multipartFile.getSize() > 0) {
		                String fileName = multipartFile.getOriginalFilename();	
		                File directory = new File(saveDirectory);	                
		                if (!directory.exists()) {
		                	directory.mkdirs();
		                	boolean flag = OSValidator.isUnix();
		                	if(flag) {
		                    	String perm = "rwxrwxrwx";
		    	            	Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perm);
		    	            	Files.setPosixFilePermissions(directory.toPath(), permissions);
		                	}
		                }
		                
		                File file = new File(saveDirectory + fileName);
		                
		                multipartFile.transferTo(file);
		                boolean flag = OSValidator.isUnix();
	                	if(flag) {
			                if(file.exists()) {
			                    //Setting file permissions for owner, group and others using PosixFilePermission
			                     
			                    HashSet<PosixFilePermission> permissions = new HashSet<PosixFilePermission>();
			                     
			                    //Adding owner's file permissions
			                     
			                    permissions.add(PosixFilePermission.OWNER_EXECUTE);
			                    permissions.add(PosixFilePermission.OWNER_READ);
			                    permissions.add(PosixFilePermission.OWNER_WRITE);
			                     
			                    //Adding group's file permissions
			                     
			                    permissions.add(PosixFilePermission.GROUP_EXECUTE);
			                    permissions.add(PosixFilePermission.GROUP_READ);
			                    permissions.add(PosixFilePermission.GROUP_WRITE);
			                     
			                    //Adding other's file permissions
			                     
			                    permissions.add(PosixFilePermission.OTHERS_EXECUTE);
			                    permissions.add(PosixFilePermission.OTHERS_READ);
			                    permissions.add(PosixFilePermission.OTHERS_WRITE);
			                     
			                    Files.setPosixFilePermissions(Paths.get(saveDirectory + fileName), permissions);
			                }
	                	}
	            	}
	            }
	        }
		} catch (Exception e) {
			logger.error("multipleFilesSaving() : "+e.getMessage());
		}
    }
	
	/*public static void saveBackgroundImage(MultipartFile file,String saveDirectory) throws IllegalStateException, IOException {
		try {
			if (null != file && !file.isEmpty()) {
	            String fileName = file.getOriginalFilename();
	            File direcory = new File(saveDirectory);
                if (!direcory.exists()) {
                	direcory.mkdirs();
                }
	            if (!"".equalsIgnoreCase(fileName)) {
	                file.transferTo(new File(saveDirectory + "login-background.jpg"));
	            }
	        }
		} catch (Exception e) {
			logger.error("singleFileSaving() : "+e.getMessage());
		}
    }*/
	
}

