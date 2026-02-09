import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

class vehicle {
    private String plateNumber;
    private LocalDateTime entryTime;

    public vehicle(String plateNumber){
        this.plateNumber = plateNumber;
        this.entryTime = LocalDateTime.now();
    }

    public String getPlateNumber(){
        return plateNumber;
    }

    public LocalDateTime getEntryTime(){
        return entryTime;
    }

}

class Ticket {
    private String vehicle;
    private LocalDateTime exitTime;
    private double fee;

    public Ticket(String vehicle){
        this.vehicle = vehicle;
    }

    public void generateExit(){
        this.exitTime = LocalDateTime.now(); 
        this.fee = calculateFee();
    }

    public double calculateFee(){
        Duration duration = Duration.between(vehicle.getEntryTime(),exitTime);
        long minutes = duration.toMinutes();
        return Math.max(2.0, minutes*0.5); // Minimum £2 or £0.05 per minute

    }

    public void printTicket(){
        System.out.println("---- Parking Ticket ----");
        System.out.println("Plate Number: " + vehicle.getPlateNumber());
        System.out.println("Entry Time: " + vehicle.getEntryTime());
        System.out.println("Exit Time: " + exitTime);
        System.out.printf("Total Fee: $%.2f\n", fee);
        System.out.println("------------------------");
    }

    public class ParkingSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ParkingLot lot = new ParkingLot();
            boolean running = true;
    
            while (running) {
                System.out.println("\n--- Parking System Menu ---");
                System.out.println("1. Vehicle Entry");
                System.out.println("2. Vehicle Exit");
                System.out.println("3. Exit System");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter plate number: ");
                        String entryPlate = scanner.nextLine();
                        lot.vehicleEntry(entryPlate);
                        break;
                    case 2:
                        System.out.print("Enter plate number: ");
                        String exitPlate = scanner.nextLine();
                        lot.vehicleExit(exitPlate);
                        break;
                    case 3:
                        running = false;
                        System.out.println("Exiting system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
    
            scanner.close();
        }
    }