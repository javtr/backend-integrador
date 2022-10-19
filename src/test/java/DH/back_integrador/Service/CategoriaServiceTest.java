package DH.back_integrador.Service;

import DH.back_integrador.model.Categorias;
import DH.back_integrador.service.CategoriaService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.transaction.Transactional;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
//@Transactional
public class CategoriaServiceTest {

    @Autowired
    private CategoriaService categoriaService;

    @Test
    public void saveCategoriaTest(){

        Categorias categoria = new Categorias("Categoria1", "descripcion1","url1");
        categoriaService.saveCategoria(categoria);
    }

    @Test
    public void getCategoriaTest(){
        System.out.println(categoriaService.getCategoria(3));
    }

    @Test
    public void getAllTest(){
        System.out.println(categoriaService.getAllCategoria());
    }

    @Test
    public void updateCategoriaTest(){

        Categorias categoria = new Categorias(3,"CategoriaUpdate", "descripcionUpdate","urlUpdate");
        categoriaService.UpdateCategoria(categoria);
    }

    @Test
    public void deleteCategoriaTest(){
        categoriaService.DeleteCategoria(3);
    }




}
