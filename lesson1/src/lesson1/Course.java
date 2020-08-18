package lesson1;

import java.util.Random;

public class Course {
    protected String[] obstacles;

    public Course(String[] obstacles) {
        this.obstacles = obstacles;
    }

    public String doIt(Team team) {
        Course c = new Course(new String[]{"Lake", "Fire", "Barrier"});

        int cnt = 2;
        Random random = new Random();

        for(int i = 0; i < 2; i++) {
            int rand = random.nextInt(cnt + 1);

            String str1 = team.members[cnt];
            team.members[cnt] = team.members[rand];
            team.members[rand] = str1;

            String str2 = c.obstacles[cnt];
            c.obstacles[cnt] = c.obstacles[rand];
            c.obstacles[rand] = str2;

            cnt--;
        }

        return team.members[0];
    }

}
