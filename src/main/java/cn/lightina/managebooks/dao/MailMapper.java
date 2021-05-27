package cn.lightina.managebooks.dao;

import cn.lightina.managebooks.pojo.MailDetail;
import cn.lightina.managebooks.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MailMapper {
    // 还书提醒
    List<MailDetail> returnReminder();

    List<MailDetail> resReminder();
}
