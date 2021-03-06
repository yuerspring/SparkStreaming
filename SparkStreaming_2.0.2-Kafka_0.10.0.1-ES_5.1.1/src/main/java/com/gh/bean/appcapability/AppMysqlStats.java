package com.gh.bean.appcapability;

import java.io.Serializable;

/**
 * Created by GH-GAN on 2016/11/29.
 */
public class AppMysqlStats  implements Serializable {
    String timestamp;
    Double connections_total;
    Double command_query_total;
    Double command_insert_total;
    Double command_update_total;
    Double command_delete_total;
    Double commands_total;
    Double handlers_total;
    Double connection_errors_total;
    Double buffer_pool_pages;
    Double thread_connected;
    Double max_connections;
    Double query_response_time_seconds;
    Double read_query_response_time_seconds;
    Double write_query_response_time_seconds;
    Double queries_inside_innodb;
    Double queries_in_queue;
    Double read_views_open_inside_innodb;
    Double table_statistics_rows_read_total;
    Double table_statistics_rows_changed_total;
    Double table_statistics_rows_changed_x_indexes_total;
    Double sql_lock_waits_total;
    Double external_lock_waits_total;
    Double sql_lock_waits_seconds_total;
    Double external_lock_waits_seconds_total;
    Double table_io_waits_total;
    Double table_io_waits_seconds_total;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getConnections_total() {
        return connections_total;
    }

    public void setConnections_total(Double connections_total) {
        this.connections_total = connections_total;
    }

    public Double getCommand_query_total() {
        return command_query_total;
    }

    public void setCommand_query_total(Double command_query_total) {
        this.command_query_total = command_query_total;
    }

    public Double getCommand_insert_total() {
        return command_insert_total;
    }

    public void setCommand_insert_total(Double command_insert_total) {
        this.command_insert_total = command_insert_total;
    }

    public Double getCommand_update_total() {
        return command_update_total;
    }

    public void setCommand_update_total(Double command_update_total) {
        this.command_update_total = command_update_total;
    }

    public Double getCommand_delete_total() {
        return command_delete_total;
    }

    public void setCommand_delete_total(Double command_delete_total) {
        this.command_delete_total = command_delete_total;
    }

    public Double getCommands_total() {
        return commands_total;
    }

    public void setCommands_total(Double commands_total) {
        this.commands_total = commands_total;
    }

    public Double getHandlers_total() {
        return handlers_total;
    }

    public void setHandlers_total(Double handlers_total) {
        this.handlers_total = handlers_total;
    }

    public Double getConnection_errors_total() {
        return connection_errors_total;
    }

    public void setConnection_errors_total(Double connection_errors_total) {
        this.connection_errors_total = connection_errors_total;
    }

    public Double getBuffer_pool_pages() {
        return buffer_pool_pages;
    }

    public void setBuffer_pool_pages(Double buffer_pool_pages) {
        this.buffer_pool_pages = buffer_pool_pages;
    }

    public Double getThread_connected() {
        return thread_connected;
    }

    public void setThread_connected(Double thread_connected) {
        this.thread_connected = thread_connected;
    }

    public Double getMax_connections() {
        return max_connections;
    }

    public void setMax_connections(Double max_connections) {
        this.max_connections = max_connections;
    }

    public Double getQuery_response_time_seconds() {
        return query_response_time_seconds;
    }

    public void setQuery_response_time_seconds(Double query_response_time_seconds) {
        this.query_response_time_seconds = query_response_time_seconds;
    }

    public Double getRead_query_response_time_seconds() {
        return read_query_response_time_seconds;
    }

    public void setRead_query_response_time_seconds(Double read_query_response_time_seconds) {
        this.read_query_response_time_seconds = read_query_response_time_seconds;
    }

    public Double getWrite_query_response_time_seconds() {
        return write_query_response_time_seconds;
    }

    public void setWrite_query_response_time_seconds(Double write_query_response_time_seconds) {
        this.write_query_response_time_seconds = write_query_response_time_seconds;
    }

    public Double getQueries_inside_innodb() {
        return queries_inside_innodb;
    }

    public void setQueries_inside_innodb(Double queries_inside_innodb) {
        this.queries_inside_innodb = queries_inside_innodb;
    }

    public Double getQueries_in_queue() {
        return queries_in_queue;
    }

    public void setQueries_in_queue(Double queries_in_queue) {
        this.queries_in_queue = queries_in_queue;
    }

    public Double getRead_views_open_inside_innodb() {
        return read_views_open_inside_innodb;
    }

    public void setRead_views_open_inside_innodb(Double read_views_open_inside_innodb) {
        this.read_views_open_inside_innodb = read_views_open_inside_innodb;
    }

    public Double getTable_statistics_rows_read_total() {
        return table_statistics_rows_read_total;
    }

    public void setTable_statistics_rows_read_total(Double table_statistics_rows_read_total) {
        this.table_statistics_rows_read_total = table_statistics_rows_read_total;
    }

    public Double getTable_statistics_rows_changed_total() {
        return table_statistics_rows_changed_total;
    }

    public void setTable_statistics_rows_changed_total(Double table_statistics_rows_changed_total) {
        this.table_statistics_rows_changed_total = table_statistics_rows_changed_total;
    }

    public Double getTable_statistics_rows_changed_x_indexes_total() {
        return table_statistics_rows_changed_x_indexes_total;
    }

    public void setTable_statistics_rows_changed_x_indexes_total(Double table_statistics_rows_changed_x_indexes_total) {
        this.table_statistics_rows_changed_x_indexes_total = table_statistics_rows_changed_x_indexes_total;
    }

    public Double getSql_lock_waits_total() {
        return sql_lock_waits_total;
    }

    public void setSql_lock_waits_total(Double sql_lock_waits_total) {
        this.sql_lock_waits_total = sql_lock_waits_total;
    }

    public Double getExternal_lock_waits_total() {
        return external_lock_waits_total;
    }

    public void setExternal_lock_waits_total(Double external_lock_waits_total) {
        this.external_lock_waits_total = external_lock_waits_total;
    }

    public Double getSql_lock_waits_seconds_total() {
        return sql_lock_waits_seconds_total;
    }

    public void setSql_lock_waits_seconds_total(Double sql_lock_waits_seconds_total) {
        this.sql_lock_waits_seconds_total = sql_lock_waits_seconds_total;
    }

    public Double getExternal_lock_waits_seconds_total() {
        return external_lock_waits_seconds_total;
    }

    public void setExternal_lock_waits_seconds_total(Double external_lock_waits_seconds_total) {
        this.external_lock_waits_seconds_total = external_lock_waits_seconds_total;
    }

    public Double getTable_io_waits_total() {
        return table_io_waits_total;
    }

    public void setTable_io_waits_total(Double table_io_waits_total) {
        this.table_io_waits_total = table_io_waits_total;
    }

    public Double getTable_io_waits_seconds_total() {
        return table_io_waits_seconds_total;
    }

    public void setTable_io_waits_seconds_total(Double table_io_waits_seconds_total) {
        this.table_io_waits_seconds_total = table_io_waits_seconds_total;
    }
}
