public class Todo {
    private String[][] scedule;

    public Todo() {
        this.scedule = new String[7][2];
    }

    public void initTodo(){
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "wash clothes";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go to courses; iron the clothes";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go shopping";
        scedule[5][0] = "Friday";
        scedule[5][1] = "arrange a meeting with friends; watch a film";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "cleaning of the apartment";
    }

    public String getDayOfWeek(int day) {
        return scedule[day][0];
    }

    public void printDayScedule(int day) {
        System.out.println(scedule[day][1]);
    }

    public void setDayScedule(int day, String tasks) {
        scedule[day][1] = tasks;
    }
}
