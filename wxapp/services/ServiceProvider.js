import {
  mockData
} from '../data/index.js';
import {
  PostService
} from 'PostService';

class ServiceProvider {

  getPostService() {
    if (!this._postService) {
      this._postService = new PostService(mockData.postList, []);
    }
    return this._postService;
  }
}

var serviceProviderInstance = new ServiceProvider();

export {
  serviceProviderInstance as serviceProvider
};