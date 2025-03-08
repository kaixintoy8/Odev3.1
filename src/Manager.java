public class Manager extends Employee {

        private int teamSize;

        public Manager(int id, String name, double salary, String department, int teamSize) {
            super(id, name, salary, department);
            this.teamSize = teamSize;
        }
        public int getTeamSize() {
            return teamSize;
        }
        @Override
        public double calculateBonus() {
            return getSalary() * 0.20;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Team Size: " + teamSize);
        }
    }

