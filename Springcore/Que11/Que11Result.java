package que11;

public class Que11Result {

	  float maths;
      float hindi;
      float english;
      float science;
      public float totalMarks;
      
	public Que11Result(float maths, float hindi, float english, float science) {
		super();
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.totalMarks = maths+hindi+english+science;
	}
      
}
