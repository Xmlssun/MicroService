package org.newit.microservice.databasedemo.dao.newit;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.newit.microservice.databasedemo.model.newit.User;
import org.newit.microservice.databasedemo.model.newit.UserExample;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newit..user
     *
     * @mbg.generated Tue Jun 04 14:12:04 CST 2019
     */
    int updateByPrimaryKey(User record);
}