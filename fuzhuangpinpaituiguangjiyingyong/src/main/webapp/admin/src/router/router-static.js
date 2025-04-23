import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import address from '@/views/modules/address/list'
    import cart from '@/views/modules/cart/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import meizhuang from '@/views/modules/meizhuang/list'
    import meizhuangCollection from '@/views/modules/meizhuangCollection/list'
    import meizhuangCommentback from '@/views/modules/meizhuangCommentback/list'
    import meizhuangOrder from '@/views/modules/meizhuangOrder/list'
    import news from '@/views/modules/news/list'
    import singleSeach from '@/views/modules/singleSeach/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryHuiyuandengji from '@/views/modules/dictionaryHuiyuandengji/list'
    import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
    import dictionaryMeizhuang from '@/views/modules/dictionaryMeizhuang/list'
    import dictionaryMeizhuangCollection from '@/views/modules/dictionaryMeizhuangCollection/list'
    import dictionaryMeizhuangErji from '@/views/modules/dictionaryMeizhuangErji/list'
        import dictionaryMeizhuangErjiAddOrUpdate from '@/views/modules/dictionaryMeizhuangErji/add-or-update'//二级
    import dictionaryMeizhuangOrder from '@/views/modules/dictionaryMeizhuangOrder/list'
    import dictionaryMeizhuangOrderPayment from '@/views/modules/dictionaryMeizhuangOrderPayment/list'
    import dictionaryMeizhuangStatus from '@/views/modules/dictionaryMeizhuangStatus/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionarySingleSeach from '@/views/modules/dictionarySingleSeach/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryHuiyuandengji',
        name: '会员等级类型',
        component: dictionaryHuiyuandengji
    }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryMeizhuang',
        name: '商品类型',
        component: dictionaryMeizhuang
    }
    ,{
        path: '/dictionaryMeizhuangCollection',
        name: '收藏表类型',
        component: dictionaryMeizhuangCollection
    }
    ,{
        path: '/dictionaryMeizhuangErji',
        name: '商品二级类型',
        component: dictionaryMeizhuangErji
    }
    ,{
        path: '/dictionaryMeizhuangErjiAddOrUpdate',
        name: '商品二级类型的新增修改页面',
        component: dictionaryMeizhuangErjiAddOrUpdate
    }
    ,{
        path: '/dictionaryMeizhuangOrder',
        name: '订单类型',
        component: dictionaryMeizhuangOrder
    }
    ,{
        path: '/dictionaryMeizhuangOrderPayment',
        name: '订单支付类型',
        component: dictionaryMeizhuangOrderPayment
    }
    ,{
        path: '/dictionaryMeizhuangStatus',
        name: '商品状态',
        component: dictionaryMeizhuangStatus
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionarySingleSeach',
        name: '单页数据类型',
        component: dictionarySingleSeach
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/meizhuang',
        name: '商品',
        component: meizhuang
      }
    ,{
        path: '/meizhuangCollection',
        name: '商品收藏',
        component: meizhuangCollection
      }
    ,{
        path: '/meizhuangCommentback',
        name: '商品评价',
        component: meizhuangCommentback
      }
    ,{
        path: '/meizhuangOrder',
        name: '商品订单',
        component: meizhuangOrder
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/singleSeach',
        name: '单页数据',
        component: singleSeach
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
