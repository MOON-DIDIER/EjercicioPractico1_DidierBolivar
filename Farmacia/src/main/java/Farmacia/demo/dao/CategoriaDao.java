/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Farmacia.demo.dao;

/**
 *
 * @author rdcd2
 */
import Farmacia.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaDao extends JpaRepository <Categoria,Long>{
}
