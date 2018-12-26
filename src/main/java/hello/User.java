package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String date;

    private String browser;

    private String ipAddress;

    private String location;

    private String device;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return ipAddress;
	}

	public void setIp(String ip) {
		this.ipAddress = ip;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
    public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}

