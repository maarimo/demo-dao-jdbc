package model.dao;

import exceptions.DAOExceptions;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj) throws DAOExceptions;
    void update(Seller obj) throws DAOExceptions;
    void deleteById(Integer id) throws DAOExceptions;
    Seller findById(Integer id) throws DAOExceptions;
    List<Seller> findAll() throws DAOExceptions;
    List<Seller> findByDepartment(Department department) throws DAOExceptions;
}
