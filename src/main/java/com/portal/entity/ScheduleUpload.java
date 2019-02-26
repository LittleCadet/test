package com.portal.entity;

import javax.validation.constraints.NotNull;

/**
 * @Author LettleCadet
 * @Date 2019/2/26
 */
public class ScheduleUpload extends FtpService
{
    //ftp远程上传路径
    @NotNull
    private String remoteScheduleUploadFilePath;

    //ftp本地上传路径
    @NotNull
    private String localUploadFilePath;

    public ScheduleUpload()
    {
    }

    public ScheduleUpload(@NotNull String remoteScheduleUploadFilePath,
        @NotNull String localUploadFilePath)
    {
        this.remoteScheduleUploadFilePath = remoteScheduleUploadFilePath;
        this.localUploadFilePath = localUploadFilePath;
    }

    public String getRemoteScheduleUploadFilePath()
    {
        return remoteScheduleUploadFilePath;
    }

    public void setRemoteScheduleUploadFilePath(String remoteScheduleUploadFilePath)
    {
        this.remoteScheduleUploadFilePath = remoteScheduleUploadFilePath;
    }

    public String getLocalUploadFilePath()
    {
        return localUploadFilePath;
    }

    public void setLocalUploadFilePath(String localUploadFilePath)
    {
        this.localUploadFilePath = localUploadFilePath;
    }

    @Override
    public String toString()
    {
        return "ScheduleUpload{" +
            "remoteScheduleUploadFilePath='" + remoteScheduleUploadFilePath + '\'' +
            ", localUploadFilePath='" + localUploadFilePath + '\'' +
            '}';
    }
}