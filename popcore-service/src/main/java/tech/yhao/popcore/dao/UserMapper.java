package tech.yhao.popcore.dao;

import tech.yhao.popcore.model.User;

public interface UserMapper {

	User findById(Integer userId);
}
