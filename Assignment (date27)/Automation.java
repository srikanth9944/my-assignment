package Interface;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

	@Override
	public void Algorithm() {
		// TODO Auto-generated method stub
		System.out.println("Algorithm");
	}
	 public static void main(String[] args) {
		
	
	 Automation sri=new  Automation();
	 sri.Algorithm();
	 sri.Java();
	 sri.Selenium();

}}
