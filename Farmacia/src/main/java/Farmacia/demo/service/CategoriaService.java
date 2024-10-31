/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Farmacia.demo.service;

import Farmacia.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    // Se obtiene un listado de categorias en un list
    public List <Categoria> getCategorias(boolean activos);  
}
