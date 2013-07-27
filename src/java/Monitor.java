
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import javax.annotation.ManagedBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

@ManagedBean
/**
 *
 * @author j0ni
 */
public class Monitor {
    
    public long getMemoryUsed(){
        MemoryMXBean bean=ManagementFactory.getMemoryMXBean();  
        long val=bean.getHeapMemoryUsage().getUsed();
        return val;
    }
    
    public double getCPULoad(){
        double cpu=ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage();
        return cpu;
    }
    
    public long getDiskSpace(){
        File hdd=new File("/");
        long dspace=hdd.getTotalSpace();
        return dspace/1024/1024/1024; 
        
    }
    
}
