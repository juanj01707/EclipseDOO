package co.edu.uco.grades.businesslogic.facade.impl;


import java.util.List;

import co.edu.uco.businesslogic.business.impl.IdTypeBusinessImpl;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.businesslogic.business.IdTypeBusiness;
import co.edu.uco.grades.businesslogic.facade.IdTypeFacade;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

public class IdTypeFacadeImpl implements IdTypeFacade{
	
	private DAOFactory daoFactory = DAOFactory.getDaoFactory();

	@Override
	public void create(IdTypeDTO dto) {
		DAOFactory daoFactory = DAOFactory.getDaoFactory(); 
		try {
			 daoFactory.initTransaction();
			 
			 IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			 idTypeBusiness.create(dto);
			 
			 daoFactory.commitTransaction();
		 }catch(GradesException exception) {
			 daoFactory.rollbackTransaction();
			 throw exception;
		 }catch(Exception exception) {
			 daoFactory.rollbackTransaction();
			 var message ="there was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			 throw GradesException.buildTechnicalBusinessLogicException(message);
		 } finally {
			 daoFactory.closeConnection();
		 }
	}

	@Override
	public void update(IdTypeDTO dto) {
		DAOFactory daoFactory = DAOFactory.getDaoFactory(); 
		try {
			 daoFactory.initTransaction();
			 
			 IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			 idTypeBusiness.update(dto);
			 
			 daoFactory.commitTransaction();
		 }catch(GradesException exception) {
			 daoFactory.rollbackTransaction();
			 throw exception;
		 }catch(Exception exception) {
			 daoFactory.rollbackTransaction();
			 var message ="there was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			 throw GradesException.buildTechnicalBusinessLogicException(message);
		 } finally {
			 daoFactory.closeConnection();
		 }
	}

	@Override
	public void delete(int id) {
		try {
			 daoFactory.initTransaction();
			 
			 IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			 idTypeBusiness.delete(id);
			 
			 daoFactory.commitTransaction();
		 }catch(GradesException exception) {
			 daoFactory.rollbackTransaction();
			 throw exception;
		 }catch(Exception exception) {
			 daoFactory.rollbackTransaction();
			 var message ="there was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			 throw GradesException.buildTechnicalBusinessLogicException(message);
		 } finally {
			 daoFactory.closeConnection();
		 }		
	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) {
		DAOFactory daoFactory = DAOFactory.getDaoFactory(); 
		try {
			 IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			 return idTypeBusiness.find(dto);
		 }catch(GradesException exception) {
			 daoFactory.rollbackTransaction();
			 throw exception;
		 }catch(Exception exception) {
			 daoFactory.rollbackTransaction();
			 var message ="there was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			 throw GradesException.buildTechnicalBusinessLogicException(message);
		 } finally {
			 daoFactory.closeConnection();
		 }
		
	}
	
	
	

}
