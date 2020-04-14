package model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import dao.MutterDAO;

public class GetMutterListLogic {

  public List<Mutter> execute() throws  ServletException, IOException {
    MutterDAO dao = new MutterDAO();
    List<Mutter> mutterList = dao.findAll();
    return mutterList;
  }
}