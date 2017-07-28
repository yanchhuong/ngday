<<<<<<< HEAD
package com.code.service;

import java.util.List;

import com.code.model.FileUploadBean;

public interface IFileImageService {
	public List<FileUploadBean> findAll();
    public void saveFileUploadBean(FileUploadBean fileUploadBean);
    public FileUploadBean findOne(long fileUploadBeanId);
    public void remove(String filename);
    public long getPIDCount();
    public void insertNew();
    public long getMaxPid();
}
=======
package com.code.service;

import java.util.List;

import com.code.model.FileUploadBean;

public interface IFileImageService {
	public List<FileUploadBean> findAll();
    public void saveFileUploadBean(FileUploadBean fileUploadBean);
    public FileUploadBean findOne(long fileUploadBeanId);
    public void remove(String filename);
    public long getPIDCount();
    public void insertNew();
    public long getMaxPid();
}
>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
