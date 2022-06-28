package com.company.interfaces;

import com.company.entitiy.Film;
import com.company.service.FileService;

public interface Comparable {
  void comparator()throws Exception;
  void openDatabase()throws Exception;
  void closeDatabase()throws Exception;
  default boolean isOpen(){
    return checkConnection();
  }
  private  boolean checkConnection(){
    Film [] films= FileService.readFile();
 if(films.length==0)
      return false;
      else return true;
    }
}
