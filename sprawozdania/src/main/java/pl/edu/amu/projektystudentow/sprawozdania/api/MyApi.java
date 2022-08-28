package pl.edu.amu.projektystudentow.sprawozdania.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class MyApi {

    //purpose of this classs is just to gather every used endpoint, i would divide it later
//
//    .get(`${process.env.REACT_APP_API}/groups/${id}`)
    @GetMapping("/groups/{id}")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String getGroup(@PathVariable Long id) {

        return "Construction in progress";
    }


    //            const {data} = await axios.get(`${process.env.REACT_APP_API}/groups`)
//            const {data} = await axios.get(API)
    @GetMapping("/groups")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public List<String> getGroups(@PathVariable Long id) {

        return List.of("Construction in progress");
    }


    //
//    const fetchData = async()=>{
//        const {data} = await axios.get(API)
//        setNotes(data)
//    }
//    fetchData()
//        const {data} = await axios.get(`${process.env.REACT_APP_API}/pages?name=about`)
//            const {data} = await axios.get(`${process.env.REACT_APP_API}/pages?name=home`)
    @GetMapping("/pages")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String getPage(@RequestParam String name) {

        return "Construction in progress";
    }


    //
//            const {data} = await axios.get(`${process.env.REACT_APP_API}/tasks/${id}`)
//            const {data} = await axios.get(`${process.env.REACT_APP_API}/tasks?group=${id_group}`)
//    setContent(data)

    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String getTask(@PathVariable Long id) {

        return "Construction in progress";
    }

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String getTask(@RequestParam Optional<Long> groupId) {

        return "Construction in progress";

    }    //

    //            const url = 'http://localhost:3000/uploadFile';
//
    @PostMapping(value = "uploadFile", consumes = {"multipart/form-data"})
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String uploadFile(@RequestParam MultipartFile file, @RequestParam String fileName) {
        return "Construction in progress";
    }

    //      const apiURL = `${process.env.REACT_APP_API}/users?task=${id_task}&group_task=${group_task}`
    @GetMapping("/users")
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String getGroup(@RequestParam Optional<Long> taskId, @RequestParam Optional<Long> groupTasl) {

        return "Construction in progress";
    }

}
