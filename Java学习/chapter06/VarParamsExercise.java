public class VarParamsExercise {
	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.print(m.showScore("sdy", 90, 80));
		System.out.print(m.showScore("tl", 90, 80, 100));
	}
}

class Methods {
	public String showScore(String name, double... scores) {
		double totalScores = 0.0;
		for (int i = 0; i < scores.length; i++) {
			totalScores += scores[i];
		}
		return name + scores.length + "门课总分为" + totalScores;
	}
}