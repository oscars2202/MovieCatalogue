package com.bangkit.moviecatalogue.data.source.remote

import android.os.Message

class APIResponse<T> (val statusResponse: StatusResponse, val body : T, val message: String?) {

    companion object {

        fun <T> success(body: T) : APIResponse<T> = APIResponse(StatusResponse.SUCCESS, body, null)

        fun <T> empty(msg : String, body: T) : APIResponse<T> = APIResponse(StatusResponse.EMPTY, body, msg)

        fun <T> error(msg : String, body: T) : APIResponse<T> = APIResponse(StatusResponse.ERROR, body, msg)
    }
}