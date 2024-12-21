package tech.codehunt.service;

import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import tech.codehunt.dao.ServiceFormCrud;
import tech.codehunt.model.ServiceForm;

@Service
public class ServiceFormServiceImpl implements ServiceFormService {

	private ServiceFormCrud serviceFormCrud;
	
	@Autowired
	public void setServiceFormCrud(ServiceFormCrud serviceFormCrud) {
		this.serviceFormCrud = serviceFormCrud;
	}
    @Transactional(rollbackFor = Exception.class)
	@Override
	public ServiceForm addService(ServiceForm serviceForm, MultipartFile multipartFile) throws Exception {

		ServiceForm save=null;
		try {
			
			save =serviceFormCrud.save(serviceForm);
			if(save!=null) {
			
			String path="E:\\SpringBoot\\taxibooking\\src\\main\\resources\\static\\myserviceimg\\"+multipartFile.getOriginalFilename();
		byte[] bytes=	multipartFile.getBytes();
		
	FileOutputStream fos	= new FileOutputStream(path);
	fos.write(bytes);
	
			}
		} catch (Exception e) {
			save=null;
			throw e;
		}
		return save;
	}
	@Override
	public List<ServiceForm> readAllServices() {

		return serviceFormCrud.findAll();
	}
	@Override
	public void deleteserviceService(int id) {
		// TODO Auto-generated method stub
		serviceFormCrud.deleteById(id);
		
	}

}
