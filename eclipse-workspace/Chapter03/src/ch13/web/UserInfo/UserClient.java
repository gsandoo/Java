package ch13.web.UserInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserClient {

	public static void main(String[] args) throws IOException {
		// 파일 읽기
		FileInputStream fis = new FileInputStream("db.properties");
		
		// key value 형태를 한번에 읽을 수있음
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("rogersddt");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao(); 
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao  = new UserInfoMySqlDao() ;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
