package com.dongfangyuxin.controller.common;

/**
 * 分页信息对象
 */
public class Page {
    /**
     * 数据偏移量
     */
    private int offset;

    /**
     * 数据量限制
     */
    private int limit;

    /**
     * Instantiates a new Page.
     *
     * @param offset the offset
     * @param limit  the limit
     */
    public Page(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Gets limit.
     *
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
