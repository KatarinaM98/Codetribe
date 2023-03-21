package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tasks task1 = new Tasks();
        //Project project1 = new Project();
        System.out.println("Enter project name: ");
        String name = s.nextLine();
        task1.setName(name);
        System.out.println("Enter project date: ");
        String date = s.nextLine();
        task1.setStartDate(date);
        System.out.println("Enter project deadline: ");
        int deadline = s.nextInt();
        s.nextLine();
        task1.setDeadline(deadline);
        System.out.println("Enter client's name: ");
        System.out.println();
        String clientName = s.nextLine();
        task1.setClientName(clientName);
        System.out.println("Enter short description: ");
        String shortDesc = s.nextLine();
        task1.setShortDescription(shortDesc);
        System.out.println("Choose status (ENTER NUMBER : 1.PLANNING, 2. DEVELOPMENT or 3. FINISHED");
        int status = s.nextInt();
//        String status1 = status.toUpperCase();
        if (status == 1 ) {
            task1.setStatus(ProjectStatus.PLANNING);
        } else if (status == 2 ) {
            task1.setStatus(ProjectStatus.DEVELOPMENT);
        } else if (status == 3) {
            task1.setStatus(ProjectStatus.FINISHED);
        }

        System.out.println(task1.toString());

        //Tasks class:


        s.nextLine();
        System.out.println("Enter task name: ");
        String name1 = s.nextLine();
        task1.setTaskName(name1);
        System.out.println("Enter task specification: ");
        String spec = s.nextLine();
        task1.setTaskSpecification(spec);
        System.out.println("Enter task deadline ");
        int taskDeadline = s.nextInt();
        task1.setTaskDeadline(taskDeadline);
        s.nextLine();

        System.out.println(task1.toString());
        //task1.toString();

        if (task1.projectStatus.equals(ProjectStatus.PLANNING)) {
            task1.statusOfTheTask.equals(TaskStatus.TO_DO);
       } else if (task1.projectStatus.equals(ProjectStatus.DEVELOPMENT)) {
           task1.statusOfTheTask.equals(TaskStatus.IN_PROGRESS);
        } else if (task1.projectStatus.equals(ProjectStatus.FINISHED)) {
            task1.statusOfTheTask.equals(TaskStatus.DONE);
       }

        task1.toString();



        while (task1.projectStatus.equals(ProjectStatus.FINISHED)) {
            System.out.println("Change project status (PLANNING, DEVELOPMENT or FINISHED)");
            String statusB = s.nextLine();
            String statusB2 = statusB.toUpperCase();
            task1.setStatus(ProjectStatus.valueOf(statusB2));
        }

        if (task1.projectStatus.equals(ProjectStatus.PLANNING)) {
            task1.statusOfTheTask.equals(TaskStatus.TO_DO);
        } else if (task1.projectStatus.equals(ProjectStatus.DEVELOPMENT)) {
           task1.statusOfTheTask.equals(TaskStatus.IN_PROGRESS);
       } else if (task1.projectStatus.equals(ProjectStatus.FINISHED)) {
           task1.statusOfTheTask.equals(TaskStatus.DONE);
       }




    }
}
