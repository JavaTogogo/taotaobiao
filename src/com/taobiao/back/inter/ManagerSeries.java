package com.taobiao.back.inter;

import com.taobiao.beans.Series;

public interface ManagerSeries {
  public void addSeries(Series series);
  public int deleteSeries(String seriesName);
  public void updateSeries(Series series);
  public Series getSeries(String seriesName);
}
