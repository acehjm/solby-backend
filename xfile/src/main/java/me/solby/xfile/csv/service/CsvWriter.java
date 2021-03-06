package me.solby.xfile.csv.service;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * me.solby.ifile.icsv.service
 *
 * @author majhdk
 * @date 2019-08-07
 */
public interface CsvWriter {

    /**
     * 写入到浏览器（下载文件）
     * 备注：默认以流的方式写入response，浏览器直接下载，可自定义Header覆盖
     *
     * @param data     数据集
     * @param fileName 文件名
     * @param type     数据类型
     * @param response Servlet响应
     * @param <T>      T
     */
    <T> void write(List<T> data, String fileName, Class<T> type, HttpServletResponse response);

    /**
     * 写入到字节输出流
     *
     * @param data     数据集
     * @param fileName 文件名
     * @param type     数据类型
     * @param <T>      T
     */
    <T> ByteArrayOutputStream writeOutputStream(List<T> data, String fileName, Class<T> type);

    /**
     * 写入到文件
     *
     * @param data     数据集
     * @param filePath 文件路径
     * @param type     数据类型
     * @param <T>      T
     */
    <T> void write(List<T> data, String filePath, Class<T> type);

}
