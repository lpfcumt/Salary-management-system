package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.Attendance;
import cn.SMS.service.AttendanceService;

@Transactional
@Lazy(true)
@Service("attendanceService")
public class AttendanceServiceImpl extends BaseServiceImpl<Attendance> implements AttendanceService{

}
