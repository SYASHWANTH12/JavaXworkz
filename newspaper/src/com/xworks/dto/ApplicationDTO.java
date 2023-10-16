package com.xworks.dto;

public class ApplicationDTO {
	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;

	public ApplicationDTO() {

	}

	public ApplicationDTO(int id, String name, String developedBy, String developedAt, String version) {
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
		this.developedAt = developedAt;
		this.version = version;
	}
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof ApplicationDTO)
			{
				ApplicationDTO K=(ApplicationDTO)obj;
				if(K.getname().equals(this.name))
				{
					System.err.println("It can not store ...");
					return true;
				}else {
					System.out.println("It can store");
				}
			}
		}
		return false;
	}

	public void setid(int id) {
		this.id = id;

	}

	public int getid() {
		return id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setdeveloped(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getdevelopedBy() {
		return developedBy;
	}

	public void setdevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}

	public String getdevelopedAt() {
		return developedAt;
	}

	public void setversion(String version) {
		this.version = version;
	}

	public String getversion() {
		return version;
	}

	public String toString() {
		return "ApplicationDTO[id=" + id + ",name=" + name + ",developedBy=" + developedBy + "" + ",developedAt="
				+ developedAt + ",version=" + version + "]";
	}
}
