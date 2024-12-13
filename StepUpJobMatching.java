import java.util.*;

abstract class Job {
    private String title;
    private String salary;
    private String skills;

    // Constructor
    public Job(String title, String salary, String skills) {
        this.title = title;
        this.salary = salary;
        this.skills = skills;
    }

    // Getters and Setters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    // Abstract method to display job details (Polymorphism)
    public abstract void displayDetails();
}

class DeliveryRiderJob extends Job {
    public DeliveryRiderJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Delivery of goods, navigating routes, ensuring timely deliveries, and providing customer service.");
    }
}

class StoreAssistantJob extends Job {
    public StoreAssistantJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Assisting customers, organizing shelves, managing inventory, handling transactions, and maintaining store cleanliness.");
    }
}

class TeacherJob extends Job {
    public TeacherJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Teaching students, preparing lesson plans, grading assignments, and managing classroom behavior.");
    }
}

class CallCenterAgentJob extends Job {
    public CallCenterAgentJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Answering customer inquiries, troubleshooting, providing solutions, and maintaining customer satisfaction.");
    }
}

class FactoryWorkerJob extends Job {
    public FactoryWorkerJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Operating machinery, assembling products, ensuring quality control, and maintaining a clean work environment.");
    }
}

class SecurityGuardJob extends Job {
    public SecurityGuardJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Monitoring security cameras, conducting patrols, and ensuring the safety of premises.");
    }
}

class WaiterJob extends Job {
    public WaiterJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Taking customer orders, serving food and drinks, maintaining cleanliness, and assisting in food preparation.");
    }
}

class JanitorJob extends Job {
    public JanitorJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Cleaning and maintaining public or private buildings, ensuring hygiene and safety standards are met.");
    }
}

class DriverJob extends Job {
    public DriverJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Driving vehicles, delivering goods, ensuring road safety, and maintaining vehicles.");
    }
}

class LaundryAttendantJob extends Job {
    public LaundryAttendantJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Washing, ironing, and folding clothes, handling customer orders, and maintaining cleanliness.");
    }
}

class CashierJob extends Job {
    public CashierJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Handling cash transactions, issuing receipts, assisting customers with payment, and maintaining the cash register.");
    }
}

class BaristaJob extends Job {
    public BaristaJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Preparing and serving coffee, maintaining cleanliness of the bar area, and interacting with customers.");
    }
}

class ShopkeeperJob extends Job {
    public ShopkeeperJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Managing stock, assisting customers, organizing products, and ensuring the shop remains tidy.");
    }
}

class GardenerJob extends Job {
    public GardenerJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Planting, watering, pruning, and maintaining gardens and outdoor areas.");
    }
}

class ConstructionWorkerJob extends Job {
    public ConstructionWorkerJob(String title, String salary, String skills) {
        super(title, salary, skills);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nJob Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills Required: " + getSkills());
        System.out.println("Responsibilities: Building and maintaining infrastructure, operating heavy machinery, ensuring safety standards are met, and working as part of a construction team.");
    }
}

class Applicant {
    private String name;
    private String address;
    private String phone;
    private int age;
    private String location;

    public Applicant(String name, String address, String phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Validate applicant's inputs (Error handling)
    public static boolean validateInputs(String name, String address, String phone, String ageStr) {
        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || ageStr.isEmpty()) {
            System.out.println("All fields are required. Please fill in all the fields.");
            return false;
        }

        if (!phone.matches("\\d{11}")) {
            System.out.println("Phone number must be 11 digits and numeric.");
            return false;
        }

        try {
            int age = Integer.parseInt(ageStr);
            if (age < 18) {
                System.out.println("Age must be at least 18.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Age must be numeric.");
            return false;
        }

        return true;
    }
}

public class StepUpJobMatching {

    private static Map<String, List<Job>> jobCatalog = new HashMap<>();

    static {
        jobCatalog.put("Delivery Rider", Arrays.asList(
            new DeliveryRiderJob("Delivery Rider", "₱700/day", "Driving, Route Planning, Time Management"),
            new DeliveryRiderJob("Bicycle Delivery Rider", "₱500/day", "Bicycle Operation, Route Planning, Time Management")
        ));

        jobCatalog.put("Store Assistant", Arrays.asList(
            new StoreAssistantJob("Store Assistant", "₱550/day", "Customer Service, Stocking, Organization"),
            new StoreAssistantJob("Sales Assistant", "₱600/day", "Sales, Communication, Customer Relations")
        ));

        jobCatalog.put("Teacher", Arrays.asList(
            new TeacherJob("Elementary Teacher", "₱20,000/month", "Teaching, Classroom Management, Patience"),
            new TeacherJob("Private Tutor", "₱300/hour", "Subject Knowledge, Teaching Skills, Communication")
        ));

        jobCatalog.put("Call Center Agent", Arrays.asList(
            new CallCenterAgentJob("Customer Service Representative", "₱15,000/month", "Communication, Problem-Solving, Patience"),
            new CallCenterAgentJob("Technical Support Agent", "₱18,000/month", "Technical Knowledge, Customer Service, Communication")
        ));

        jobCatalog.put("Factory Worker", Arrays.asList(
            new FactoryWorkerJob("Production Worker", "₱450/day", "Assembly, Attention to Detail, Teamwork"),
            new FactoryWorkerJob("Packaging Worker", "₱500/day", "Packaging, Quality Control, Teamwork")
        ));

        jobCatalog.put("Security Guard", Arrays.asList(
            new SecurityGuardJob("Building Security Guard", "₱500/day", "Surveillance, Attention to Detail, Customer Service"),
            new SecurityGuardJob("Event Security", "₱600/day", "Crowd Control, Patrolling, Safety Protocols")
        ));

        jobCatalog.put("Waiter", Arrays.asList(
            new WaiterJob("Restaurant Waiter", "₱450/day", "Customer Service, Communication, Multitasking"),
            new WaiterJob("Café Waiter", "₱500/day", "Serving, Customer Interaction, Cash Handling")
        ));

        jobCatalog.put("Janitor", Arrays.asList(
            new JanitorJob("Building Janitor", "₱450/day", "Cleaning, Organization, Attention to Detail"),
            new JanitorJob("Office Cleaner", "₱500/day", "Cleaning, Dusting, Organizing")
        ));

        jobCatalog.put("Driver", Arrays.asList(
            new DriverJob("Delivery Driver", "₱600/day", "Driving, Time Management, Safety"),
            new DriverJob("Personal Driver", "₱700/day", "Driving, Navigation, Punctuality")
        ));

        jobCatalog.put("Laundry Attendant", Arrays.asList(
            new LaundryAttendantJob("Laundry Attendant", "₱400/day", "Laundry Skills, Customer Service, Attention to Detail")
        ));

        jobCatalog.put("Cashier", Arrays.asList(
            new CashierJob("Grocery Cashier", "₱500/day", "Cash Handling, Customer Service, Attention to Detail"),
            new CashierJob("Retail Cashier", "₱450/day", "Customer Service, Cash Register, Communication")
        ));

        jobCatalog.put("Barista", Arrays.asList(
            new BaristaJob("Coffee Shop Barista", "₱450/day", "Coffee Making, Customer Service, Multitasking")
        ));

        jobCatalog.put("Shopkeeper", Arrays.asList(
            new ShopkeeperJob("Convenience Store Shopkeeper", "₱500/day", "Customer Service, Stock Management, Cash Handling"),
            new ShopkeeperJob("Market Stall Owner", "₱450/day", "Product Management, Customer Service, Sales")
        ));

        jobCatalog.put("Gardener", Arrays.asList(
            new GardenerJob("Gardener", "₱500/day", "Plant Care, Lawn Maintenance, Gardening Tools")
        ));

        jobCatalog.put("Construction", Arrays.asList(
            new ConstructionWorkerJob("Construction Worker", "₱600/day", "Building, Heavy Machinery Operation, Safety Protocols, Teamwork"),
            new ConstructionWorkerJob("Painter", "₱800/day", "Painting Skills, Safety Standards,Application of Paint")
        ));
    }
    
    // Get Jobs for a specific role
    public static List<Job> getJobsForRole(String role) {
        return jobCatalog.getOrDefault(role, new ArrayList<>());
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to StepUp: BATANGAS Job-Matching Platform!");

        // Step 1: Input applicant details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your phone number (11 digits): ");
        String phone = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        // Validate applicant details
        if (!Applicant.validateInputs(name, address, phone, age)) {
            return; // Exit if validation fails
        }

        // Step 2: Display all available jobs
        System.out.println("\nChoose a job from the list below:");

        List<Job> allJobs = new ArrayList<>();
        for (List<Job> jobs : jobCatalog.values()) {
            allJobs.addAll(jobs);
        }

        int index = 1;
        for (Job job : allJobs) {
            System.out.println(index++ + ". " + job.getTitle());
        }

        System.out.print("\nEnter the number corresponding to your chosen job: ");
        int jobChoice = -1;
        try {
            jobChoice = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }

        if (jobChoice < 0 || jobChoice >= allJobs.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        Job selectedJob = allJobs.get(jobChoice);

        // Step 3: Display the details of the selected job
        selectedJob.displayDetails();

        // Step 4: Enter location
        System.out.print("\nEnter your location (e.g., municipality, city): ");
        String location = scanner.nextLine();

        // Assign the location to the applicant
        Applicant applicant = new Applicant(name, address, phone, Integer.parseInt(age));
        applicant.setLocation(location);

        // Step 5: Apply for the job
        System.out.print("\nDo you want to apply for this job? (Yes/No): ");
        String applyChoice = scanner.nextLine().trim().toLowerCase();
        if (applyChoice.equals("yes")) {
            System.out.println("\nThank you for applying for the job.");
            System.out.println("Your location: " + applicant.getLocation());
            System.out.println("Our team will get in touch with you soon.");
        } else {
            System.out.println("You chose not to apply. Thank you for using StepUp!");
        }

        // Closing scanner
        scanner.close();
    }
}