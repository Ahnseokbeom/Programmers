package programmers;

public class PRO_2_SkiilTrees {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		for (String skillTree : skill_trees) {
            String tempSkill = skillTree;

            for (int i = 0; i < skillTree.length(); i++) {
                String s = skillTree.substring(i, i+1);
                if (!skill.contains(s)) {
                    tempSkill = tempSkill.replace(s, "");
                }
            }

            if (skill.indexOf(tempSkill) == 0)
                answer++;
        }
		System.out.println(answer);
	}

}
