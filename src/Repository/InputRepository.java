package Repository;

import DataAccess.InputDao;

public class InputRepository implements IInputRepository {

    @Override
    public void getPhone(String phone) {
        InputDao.Instance().getPhone(phone);
    }

    @Override
    public void getDate(String date) {
        InputDao.Instance().checkInputDate(date);
    }

    @Override
    public void getEmail(String email) {
        InputDao.Instance().checkInputEmail(email);
    }
    
}
