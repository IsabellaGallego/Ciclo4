import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import bootswatch from '../node_modules/bootswatch/dist/simplex/bootstrap.css'

createApp(App).use(router,bootswatch).use(router).mount('#app')
