import java.util.*; 
class Hotel{ 
    private int hotelId; 
    private String hotelName; 
    private String dateOfBooking; 
    private int noOfRoomsBooked; 
    private String wifiFacility; 
    double totalBill; 

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill){ 
        this.hotelId=hotelId; 
        this.hotelName=hotelName; 
        this.dateOfBooking = dateOfBooking; 
        this.noOfRoomsBooked=noOfRoomsBooked; 
        this.wifiFacility = wifiFacility; 
        this.totalBill = totalBill; 
    } 
    public int getHotelId(){ 
        return hotelId; 
    } 
    public String getHotelName(){ 
        return hotelName; 
    } 
    public String getDateOfBooking(){ 
        return dateOfBooking; 
    } 
    public int getNoOfRoomsBooked(){ 
        return noOfRoomsBooked; 
    } 
    public String getWifiFacility(){ 
        return wifiFacility;
     } 
    public double getTotalBill(){ 
        return totalBill; 
    } 
        //setters 
    public void setHotelId(int hotelId){ 
        this.hotelId=hotelId; 
    } 
    public void setHotelName(String hotelName){ 
        this.hotelName= hotelName; 
    } 
    public void setDateOfBooking (String dateOfBooking){ 
        this.dateOfBooking = dateOfBooking; 
    } 
    public void setWifiFacility(String wifiFacility){ 
        this.wifiFacility= wifiFacility; 
    } 
    public void setTotalBill(double totalBill){ 
        this.totalBill = totalBill; 
    } 
} 
    public class XploreQ3{ 
        public static void main(String[] args){ 
            Scanner sc = new Scanner(System.in); 
            Hotel[] arr = new Hotel[4]; 
            for(int i = 0 ; i < arr.length ; i ++){ 
                int hotelId= sc.nextInt(); sc.nextLine(); 
                String hotelName = sc.nextLine(); 
                String dateOfBooking = sc.nextLine(); 
                int noOfRoomsBooked= sc.nextInt(); sc.nextLine(); 
                String wifiFacility = sc.nextLine(); 
                double totalBill = sc.nextDouble(); sc.nextLine(); 
                arr[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill); 
            } 
            String searchMonth= sc.nextLine(); 
            String searchWifi = sc.nextLine(); 
            int roomsAns = noOfRoomsBookedInGivenMonth(arr, searchMonth); 
            if (roomsAns==0){ System.out.println("No rooms booked in the given month"); 

            }else{ System.out.println(roomsAns); 

            } 
            Hotel ans = searchHotelByWifiOption(arr, searchWifi); 
            if (ans == null){ System.out.println("No such option available"); 

            }else{ 
                System.out.println(ans.getHotelId()); 
            }
            sc.close();
         } 
        static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String searchMonth){ 
            int totalrooms = 0; 

            for(Hotel h : arr){ 
                String[] date = h.getDateOfBooking().split("-"); 
                if (date[1].equalsIgnoreCase(searchMonth)){ totalrooms += h.getNoOfRoomsBooked(); 

                } 
            } 
            return totalrooms; 
        } 
        static Hotel searchHotelByWifiOption(Hotel[] arr, String searchWifi){ 
            Hotel first = null; 
            Hotel second = null; 

            for(Hotel h : arr){ 

                if (h.getWifiFacility().equalsIgnoreCase(searchWifi)){ 

                    if (first == null || h.getTotalBill() > first.getTotalBill()){ 
                        second = first; 
                        first = h; 
                    }
                    else if (second == null || h.getTotalBill() > second.getTotalBill()){ 
                        second = h; 
                    }
                } 
                } 
                return second; 
            } 
        }