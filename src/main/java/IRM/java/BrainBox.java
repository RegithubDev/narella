package IRM.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;


@JsonPropertyOrder({ "TransactionNo2", "VehicleNo", "TypeofMaterial",
	"DateIn", "TimeIN", "DateOut","TimeOUT", "GROSSWeight", "TareWeight", "NetWeight" })
public class BrainBox {

	//$posts[] = array('TRNo'=> $trn, 'VehicleNo'=> $vehn, 'TypeofMaterial'=> $tomw, 'DateIn'=> $datei, 
	//'TimeIn'=> $timei, 'DateOut'=> $dateou, 'TimeOut'=> $timeou, 'GROSSWeight'=> $grossw, 'TareWeight'=> $tarew, 'NetWeight'=> $netw)
	
	private String TransactionNo1;
	private String TransactionNo2;
	private String VehicleNo;
	private String TypeofMaterial;
	private String DateIn;
	private String TimeIN;
	private String DateOUT;
	private String TimeOUT;
	private String GROSSWeight;
	private String TareWeight;
	private String NetWeight;
	private String Zone;
	private String Transporter; 
	private String Transferstation;
	
	
	public BrainBox() {}

    private Map<String, Object> otherProperties = new LinkedHashMap<>();

	public BrainBox(String transactionNo1, String transactionNo2, String vehicleNo, String typeofMaterial,
			String dateIn, String timeIN, String dateOUT, String timeOUT, String gROSSWeight, String tareWeight,
			String netWeight, String zone, String transporter, String transferstation,
			Map<String, Object> otherProperties) {
		super();
		TransactionNo1 = transactionNo1;
		TransactionNo2 = transactionNo2;
		VehicleNo = vehicleNo;
		TypeofMaterial = typeofMaterial;
		DateIn = dateIn;
		TimeIN = timeIN;
		DateOUT = dateOUT;
		TimeOUT = timeOUT;
		GROSSWeight = gROSSWeight;
		TareWeight = tareWeight;
		NetWeight = netWeight;
		Zone = zone;
		Transporter = transporter;
		Transferstation = transferstation;
	}
	public String getTransactionNo1() {
		return TransactionNo1;
	}
	public void setTransactionNo1(String transactionNo1) {
		TransactionNo1 = transactionNo1;
	}
	public String getTransactionNo2() {
		return TransactionNo2;
	}
	public void setTransactionNo2(String transactionNo2) {
		TransactionNo2 = transactionNo2;
	}
	public String getZone() {
		return Zone;
	}
	public void setZone(String zone) {
		Zone = zone;
	}
	public String getTransporter() {
		return Transporter;
	}
	public void setTransporter(String transporter) {
		Transporter = transporter;
	}
	public String getTransferstation() {
		return Transferstation;
	}
	public void setTransferstation(String transferstation) {
		Transferstation = transferstation;
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}

	public String getTypeofMaterial() {
		return TypeofMaterial;
	}

	public void setTypeofMaterial(String typeofMaterial) {
		TypeofMaterial = typeofMaterial;
	}

	public String getDateIn() {
		return DateIn;
	}

	public void setDateIn(String dateIn) {
		DateIn = dateIn;
	}

	public String getTimeIN() {
		return TimeIN;
	}

	public void setTimeIN(String timeIN) {
		TimeIN = timeIN;
	}

	public String getDateOUT() {
		return DateOUT;
	}

	public void setDateOUT(String dateOUT) {
		DateOUT = dateOUT;
	}

	public String getTimeOUT() {
		return TimeOUT;
	}

	public void setTimeOUT(String timeOUT) {
		TimeOUT = timeOUT;
	}

	public String getGROSSWeight() {
		return GROSSWeight;
	}

	public void setGROSSWeight(String gROSSWeight) {
		GROSSWeight = gROSSWeight;
	}

	public String getTareWeight() {
		return TareWeight;
	}

	public void setTareWeight(String tareWeight) {
		TareWeight = tareWeight;
	}

	public String getNetWeight() {
		return NetWeight;
	}

	public void setNetWeight(String netWeight) {
		NetWeight = netWeight;
	}
    @JsonAnyGetter
    public Map<String, Object> getOtherProperties() {
        return otherProperties;
    }

    @JsonAnySetter
    public void setOtherProperties(String key, Object value) {
        otherProperties.put(key, value);
    }

    // Example of adding an additional property to the object
    public void setPhoneNumber(String phoneNumber) {
        otherProperties.put("phone", phoneNumber);
    }
	@Override
	public String toString() {
		return "BrainBox [TransactionNo1=" + TransactionNo1 + ", TransactionNo2=" + TransactionNo2 + ", VehicleNo="
				+ VehicleNo + ", TypeofMaterial=" + TypeofMaterial + ", DateIn=" + DateIn + ", TimeIN=" + TimeIN
				+ ", DateOUT=" + DateOUT + ", TimeOUT=" + TimeOUT + ", GROSSWeight=" + GROSSWeight + ", TareWeight="
				+ TareWeight + ", NetWeight=" + NetWeight + ", Zone=" + Zone + ", Transporter=" + Transporter
				+ ", Transferstation=" + Transferstation + "]";
	}

	
}
