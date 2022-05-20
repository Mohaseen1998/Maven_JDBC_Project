package jdbcmaven;

public class app {
	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		Student se = new Student();
		se.setId(1);
		se.setName("maha");
		se.setPhone(9686);
		sd.saveStudent(se);
	}
}
