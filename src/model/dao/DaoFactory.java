package model.dao;

import db.Conexao;
import db.DBConfig;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Seller;

import java.sql.SQLException;

public class DaoFactory {
    public static SellerDao createSellerDao() throws SQLException {
        return new SellerDaoJDBC(Conexao.getConnection());
    }
}
