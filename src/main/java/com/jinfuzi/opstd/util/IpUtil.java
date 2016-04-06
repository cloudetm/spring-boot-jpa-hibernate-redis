package com.jinfuzi.opstd.util;

import com.google.common.base.Preconditions;
import com.jinfuzi.opstd.util.ipaddress.QQWryFile;
import com.jinfuzi.opstd.util.ipaddress.QQWryRecord;

import java.io.RandomAccessFile;

/**
 * Created by zhangyuanxin on 2016/4/1.
 */
public class IpUtil {
    public static final String getAddressByIp(String ip) {
        Preconditions.checkNotNull(ip, "ip is null");
        QQWryFile qqWryFile = QQWryFile.getInstance();
        RandomAccessFile ipFile = qqWryFile.getIpFile();
        QQWryRecord record = qqWryFile.find(ip, ipFile);
        return record.getCountry();
    }
}
