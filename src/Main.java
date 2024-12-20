

public class Main {
    public static void main(String[] args) {
        Station station1 = new Station();
        Station station2 = new Station();
        station1.newStation("", 9.7,     60, 50);
        station2.newStation("ti", -9, 1000, 15);
        if (!(station1.getLostMoney() < 0 || station1.getSoldTickets() < 0 || station1.getTicketPrice() < 0 || station1.getNumberOfSeat() < 0)){
            System.out.println("Название станции: " + station1.getStationName() + "\nКоличество мест: " + station1.getNumberOfSeat() + "\nКоличество проданных билетов: " + station1.getSoldTickets() + "\nЦена билета: " + station1.getTicketPrice() + "$\nОбщая стоимость непроданных билетов: " + station1.getLostMoney() + "$");
        }
        else{
            System.out.println("были неправильно введены цена, количество мест или количество проданных билетов");
        }
        if (!(station2.getLostMoney() < 0 || station2.getSoldTickets() < 0 || station2.getTicketPrice() < 0 || station2.getNumberOfSeat() < 0)){
            System.out.println("Название станции: " + station2.getStationName() + "\nКоличество мест: " + station2.getNumberOfSeat() + "\nКоличество проданных билетов: " + station2.getSoldTickets() + "\nЦена билета: " + station2.getTicketPrice() + "$\nОбщая стоимость непроданных билетов: " + station2.getLostMoney() + "$");
        }
        else{
            System.out.println("были неправильно введены цена, количество мест или количество проданных билетов");
        }

    }
}

class Station{
    private String stationName = "название станции должно содержать хотя бы один символ!";
    private double ticketPrice = -1;
    private int numberOfSeat = -1, soldTickets = -1;


    public void newStation(String stationName, double ticketPrice, int numberOfSeat, int soldTickets){
        setStationName(stationName);
        setTicketPrice(ticketPrice);
        setNumberOfSeat(numberOfSeat);
        setSoldTickets(soldTickets);
    }
    public void setStationName(String stationName){
        if (!stationName.isEmpty()) {
            this.stationName = stationName;
        }
    }

    public String getStationName(){
        return stationName;
    }

    public void setNumberOfSeat(int numberOfSeat){
        if (!(numberOfSeat < 0)){
            this.numberOfSeat = numberOfSeat;
        }
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setSoldTickets(int soldTickets) {
        if(!(soldTickets < 0 || soldTickets > this.numberOfSeat)){
            this.soldTickets = soldTickets;
        }
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    public void setTicketPrice(double ticketPrice){
        if(!(ticketPrice < 0)) {
            this.ticketPrice = ticketPrice;
        }
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public double getLostMoney() {
        return (((numberOfSeat - soldTickets) * ticketPrice));
    }
}