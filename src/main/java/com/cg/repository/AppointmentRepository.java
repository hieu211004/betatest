package com.cg.repository;

import com.cg.model.Appointment;
import com.cg.model.dtos.appointment.AppointmentResDTO;
import com.cg.model.enums.ETime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> getAllByRoomIdAndDayAndTime(Long roomId, Date day, ETime time);

    List<Appointment> getAllByDoctorIdAndDayAndTime(Long doctorId, Date day, ETime time);

    List<Appointment> getAllByDoctorId(Long doctorId);

    @Query("SELECT new com.cg.model.dtos.appointment.AppointmentResDTO(" +
            "apm.id," +
            "apm.doctor," +
            "apm.speciality," +
            "apm.room," +
            "apm.day," +
            "apm.time," +
            "apm.price," +
            "apm.isAvailable" +
            ") from Appointment as apm where apm.deleted = false")
    List<AppointmentResDTO> findAllAppointmentResDTO();
}
