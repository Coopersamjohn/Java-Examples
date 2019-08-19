package example_inheritance_composition;

public class Employeer {
	
	private int eid;
	private String ename;
	private String trainer;
	
	public Employeer() {
		// TODO Auto-generated constructor stub
	}

	public Employeer(int eid, String ename, String trainer) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.trainer = trainer;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	public void printEmployeer() {
		System.out.println("Employeer Details are: ");
		System.out.println("Employeer Id: "+eid);
		System.out.println("Employeer Name: "+ename);
		System.out.println("Trainer Name: "+trainer);
	}

}
