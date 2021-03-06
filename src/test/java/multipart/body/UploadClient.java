package multipart.body;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.multipart.MultipartBody;

import java.util.List;

@Client("/")
public interface UploadClient {
    @Post(produces = MediaType.MULTIPART_FORM_DATA)
    List<String> upload(@Body MultipartBody file);
}
