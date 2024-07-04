package org.Clothify.bo.User.impl;

import org.Clothify.bo.User.USerBo;
import org.Clothify.dao.DaoFactory;
import org.Clothify.dao.User.UserDao;
import org.Clothify.dto.User;
import org.Clothify.entity.UserEntity;
import org.Clothify.util.DaoType;
import org.modelmapper.ModelMapper;

public class UserBoImpl implements USerBo {
    private UserDao userDao = DaoFactory.getInstance().getDao(DaoType.USER);

    @Override
    public boolean saveUser(User dto) {
        return userDao.save(new ModelMapper().map(dto, UserEntity.class));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
