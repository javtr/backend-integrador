package DH.back_integrador.service;

import DH.back_integrador.model.Categorias;
import DH.back_integrador.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService
{
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categorias saveCategoria(Categorias categoria){
        System.out.println(categoria);
        return categoriaRepository.save(categoria);
    }

    public Categorias getCategoria(Integer id){
        return categoriaRepository.findById(id).get();
    }

    public List<Categorias> getAllCategoria(){
        return categoriaRepository.findAll();
    }

    public void UpdateCategoria(Categorias categoria){
        categoriaRepository.save(categoria);
    }

    public void DeleteCategoria(Integer id){
        categoriaRepository.deleteById(id);
    }

}
