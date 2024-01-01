package graduation.busstation.repository;

import graduation.busstation.entity.BusStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationRepository extends JpaRepository<BusStation, Long> {

    List<BusStation> findByBusStationName(String busStationName);
    List<BusStation> findByDeviceMacAddress(String deviceMacAddress);

}
