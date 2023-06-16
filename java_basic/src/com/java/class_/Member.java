package com.java.class_;

public class Member {
	private String id;
	private String pwd;

	public boolean equals(Object obj) {
		// return super.equals(obj); obj �޼ҵ忡�� �ϴ����

		boolean result = false;
		if (obj instanceof Member) {	//��� �ν��Ͻ����� Ȯ��
			Member other = (Member)obj;	//������Ʈ ���۷����� ����� �ٲ�(������Ʈ Ÿ�Կ��� getId��� �޼ҵ尡 ����)
		if (other.getId().equals(id)) {	
			// other.getId�� String�� ��ȯ�� 
			// equals : String�� equalsȣ��
				result = true;
			}
		}
		return result;

	}
	

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	

	@Override
	public String toString() {
		return id;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
