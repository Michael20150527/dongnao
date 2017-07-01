package cn.itcast.ioc;

public class UserService {
	
    private UserDao dao;
	
	public void add(){
		System.out.println("Service...........");
		dao.add();
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
