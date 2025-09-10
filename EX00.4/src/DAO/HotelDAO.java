
package DAO;

import DTO.HotelDTO;
import java.util.ArrayList;
import java.util.List;


public class HotelDAO {
    private final List<HotelDTO> hoteis = new ArrayList<>();

    public HotelDAO() {
    }

    public void adcHotel(HotelDTO hotel) {
        hoteis.add(hotel);
    }

    public void listarLivro() {
        if (hoteis.isEmpty()) {
            System.out.println("Nenhum livro foi cadastrado");
        } else {
            for (HotelDTO hotel : hoteis) {
                System.out.println(hotel);

            }

        }
    }
}

    

//    public void removerLivro() {
//        if (hoteis.isEmpty()) {
//            System.out.println("Nenhum livro para remover.");
//        } else {
//          hoteis.remove(hoteis.size() -1);
//            System.out.println("Último livrto foi removido com sucesso.");
//        }
//    }
//}


