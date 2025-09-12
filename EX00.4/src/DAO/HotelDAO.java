package DAO;

import DTO.HotelDTO;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
    private final List<HotelDTO> hoteis = new ArrayList<>();

    public void adcHotel(HotelDTO hotel) {
        hoteis.add(hotel);
    }

    public List<HotelDTO> getTodos() {
        return hoteis;
    }
    
    public void listarHotel() {
    if (hoteis.isEmpty()) {
        System.out.println("Nenhuma reserva foi feita.");
    } else {
        for (HotelDTO hotel : hoteis) {
            System.out.println(hotel);
        }
    }
}
}
